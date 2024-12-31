pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm  // Récupère le code source depuis Git
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'  // Commande pour construire le projet avec Maven sur Windows
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'  // Commande pour exécuter les tests unitaires
            }
        }

        stage('Deploy') {
            steps {
                bat 'robocopy C:\\path\\to\\build\\directory \\\\remote-server\\path /MIR'  // Déployer sur le serveur distant
            }
        }
    }
}
