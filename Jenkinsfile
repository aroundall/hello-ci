pipeline {
    agent any
    stages {
        stage('Build') {
           steps {
               sh './gradlew clean build -x test'
           }
        }
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
        stage('Results') {
            steps {
                junit 'build/test-results/**/*.xml'
                archive 'build/libs/**/*.jar'
            }
        }
        stage('Deploy') {
            steps {
                sh 'chmod 400 ssh/id_rsa'
                sh 'ansible dev -m setup'
                // stop remote service
                // copy artifact
                // start remote service
            }
        }
    }
}