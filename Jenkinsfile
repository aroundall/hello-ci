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
                // for ssh-key security, otherwise, it will be failed to connect with ssh.
                sh 'cd ansible'
                sh 'chmod 400 ./ssh/id_rsa'
                sh 'ansible-playbook playbook.yml'
            }
        }
    }
}