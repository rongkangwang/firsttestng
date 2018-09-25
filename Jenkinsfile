pipeline {
    agent any
    stages {
        stage('Before') {
            steps {
                echo 'Starting sonar analysis...'
            }
        }
        stage('Test Maven') {
            steps {
                withMaven(maven:'m3') {
                    sh 'mvn test'
                }
            }
        }
        stage('Build and Analyzing') {
            steps {
                withSonarQubeEnv("sonar") {
                    withMaven(maven:'m3', mavenLocalRepo:'.repository') {
                        sh "mvn clean compile sonar:sonar"
                    }
                }
            }
        }
    }
}