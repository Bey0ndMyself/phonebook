pipeline {
    agent any

    parameters {
        string(name: 'VERSION', defaultValue: '1.0.0')
        booleanParam(name: 'executeTests', defaultValue: true)
    }

    stages {
        stage("build") {
            steps {
                echo 'build stage'
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