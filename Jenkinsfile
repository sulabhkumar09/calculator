pipeline { 
    agent any 
    tools{
        maven 'Default'
        jdk 'Default'
    }
     environment {                                      
        SERVER_ID = 'my-artifact'
        registry = "sulabhdocker09/docker-test"
         registryCredential = 'dockerhub'
    }

        stages { 
            stage ('Clean') { 
                steps { 
                
                        bat 'mvn clean'
                    
                }
            }
       
            // stage ('Test') { 
            //     steps { 
                
            //             bat 'mvn test'
                    
            //     }
            // }
        
            stage ('Build') { 
                steps { 
                
                        bat 'mvn install'
                    
                }
            }
             stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
             }
             stage('Deploy Image') {
        steps{  
            script {
                docker.withRegistry( '', registryCredential ) {
                     dockerImage.push()
                     }
                 }
              }
            
        //      stage("Upload artifact") {
        //     steps {
        //         rtUpload (                             
        //             serverId: "$SERVER_ID",
        //             spec: '''{
        //                   "files": [
        //                     {
        //                       "pattern": "target/*.war",
        //                       "target": "libs-snapshot-local/"
        //                     }
        //                  ]
        //             }'''
        //         )
        //     }
        // }

        //     stage ('Sonar Analysis'){
        //          steps{
        //             bat 'mvn sonar:sonar \
        //              -Dsonar.projectKey=Sonar-calculator-code \
        //              -Dsonar.host.url=http://localhost:9000 \
        //              -Dsonar.login=a97a24e8cf9fad8e1282fb52e75539285b10722c'
                     
        //         }
        //     }
        // }
         post { 
            always { 
          junit 'target/surefire-reports/*.xml'   
        
    }

}

       
}
