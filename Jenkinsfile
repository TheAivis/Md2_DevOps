pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/TheAivis/Md2_DevOps.git'
                sh 'mvnw clean compile'
            }
        }
        stage('Unit Test'){
            steps {
            sh 'mvnw test'
            }
            post {
                always {
                    junit '**/DummyJavaCode/src/MyUnitTest.java'
                }
            }
        }
    }
}
