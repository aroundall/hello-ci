pipeline {
    agent any
    stages {
       stage('Build') {
           sh './gradlew clean build -x test'
       }
       stage('Test') {
           sh './gradlew check'
       }
       stage('Results') {
          junit 'build/test-results/**/*.xml'
          archive 'build/libs/**/*.jar'
       }
    }
}