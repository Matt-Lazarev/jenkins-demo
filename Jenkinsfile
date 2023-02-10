pipeline {
    agent {
        node {
            label 'docker-agent-maven'
        }
    }
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Prepare') {
            steps {
                echo "Test Java and Maven versions.."
                sh 'java --version'
                sh 'mvn --version'
            }
        }
        stage('Build') {
            steps {
                echo "Building.."
                sh 'mvn package -Dmaven.test.skip'
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            echo 'Pipeline has completed'
        }
        success {
            echo 'Pipeline is successfull'
        }
        failure {
            echo 'Pipeline is failed'
        }
    }
}