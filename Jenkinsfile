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
        stage('Clone_GitHub_Project') {
            steps {
                echo "Pulling GitHub project"
                sh 'git clone https://github.com/Matt-Lazarev/jenkins-demo.git'
            }
        }
        stage('Build') {
            steps {
                dir('jenkins-demo'){
                    echo "Building.."
                    sh 'mvn package -Dmaven.test.skip'
                }
            }
        }
        stage('Test') {
            steps {
                dir('jenkins-demo'){
                    echo "Testing.."
                    sh 'mvn test'
                }
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