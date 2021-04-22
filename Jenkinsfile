pipeline { 
    agent any 
    tools{
        maven 'Default'
        jdk 'Default'
    }
        stages { 
            stage ('Clean') { 
                steps { 
                
                        bat 'mvn clean'
                    
                }
            }
        }
         stages { 
            stage ('Test') { 
                steps { 
                
                        bat 'mvn test'
                    
                }
            }
        }
        stages { 
            stage ('Build') { 
                steps { 
                
                        bat 'mvn install'
                    
                }
            }
        }
    }
