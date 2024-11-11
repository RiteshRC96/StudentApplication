pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat-credentials', url: 'http://localhost:8080')], contextPath: '/StudentProfileApp', war: '**/target/*.war'
            }
        }
    }
}
