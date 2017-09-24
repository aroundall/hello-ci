pipeline {
    agent any
    stages {
       stage('Preparation') { // for display purposes
          // Get some code from a GitHub repository
          git 'https://github.com/aroundall/hello-ci.git'
       }
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