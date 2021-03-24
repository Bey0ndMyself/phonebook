pipeline {
    agent any

    tools {
        maven 'maven 3.6.3'
    }

    parameters {
        string(name: 'VERSION', defaultValue: '1.0.0')
        booleanParam(name: 'executeTests', defaultValue: true)
    }

    stages {
        stage("build") {
            steps {
                echo 'build stage'
                sh 'mvn install'
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                echo 'test stage'
            }
        }
        stage("deploy") {
            steps {
                echo 'deploy stage'
                echo "deploying version ${params.VERSION}"
            }
        }
    }
}