pipeline { 
    agent any 
    tools{
        maven 'Default'
        jdk 'Default'
    }
        stages { 
            stage ('Build') { 
                steps { 
                
                        bat 'mvn clean'
                    
                }
            }
        }
    }
