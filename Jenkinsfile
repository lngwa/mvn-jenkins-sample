pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh "echo building ..."
                withMaven(maven: 'maven_3_5_0'){
                    sh "mvn clean package"
                }
            }

        }
        stage("deploy") {
            steps {
                sh "cp target/mvn-jenkins-sample.war C:/xampp/tomcat/webapp"
            }
        }
    }
}