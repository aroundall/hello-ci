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
    }
}