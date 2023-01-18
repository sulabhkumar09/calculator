pipeline { 
    
    agent any
//     tools{
        
//              maven 'Default'
//              jdk 'Default'
//          }
    
     environment {                                      

                     SERVER_ID = 'my-artifact'
                     registry = "sulabhdocker09/docker-mvn"
                     registryCredential = 'dockerhub'
                }

        stages { 
            stage ('Clean') { 
                steps { 
                
                        sh 'mvn clean'
                    
                            }
                    }
       
            stage ('Test') { 
                steps { 
                
                        sh 'mvn test'
                    
                      }
                 }
        
            stage ('Build') { 
                steps { 
                
                        sh 'mvn install'
                    
                     }
                    }
            
//         stage("Upload artifact") {
//             steps {
//                 rtUpload (                             
//                     serverId: "$SERVER_ID",
//                     spec: '''{
//                           "files": [
//                             {
//                               "pattern": "target/*.war",
//                               "target": "libs-snapshot-local/"
//                             }
//                          ]
//                     }'''
//                 )
//             }
//         }
        
         stage ('Sonar Analysis'){
                 steps{
                    sh 'mvn sonar:sonar \
                         -Dsonar.projectKey=jenkinsci \
                         -Dsonar.host.url=http://13.127.216.146:9000 \
                         -Dsonar.login=7600d9aaa1f7f5db91b6ff8f9f998a4cffb4c729'
                     
                }
            }
            

       
        stage('Docker Build and Tag') {
          steps {
              
                   sh 'docker build -t sulabhdocker09/docker-mvn:latest .'
                // bat 'docker build -t docker-test1:latest .' 
                // bat 'docker tag docker-test1 sulabhdocker09/docker-test1:latest'
                
               
          }
        }
     
     stage('Publish image to Docker Hub') {
          
            steps {
                script{
        docker.withRegistry( '', registryCredential ) {
          sh  'docker push sulabhdocker09/docker-mvn:latest'
       
                 }
            }
          }
        }
        
//         stage('Stop Running Container'){
             
//             steps{
//                 script{
//                         bat 'docker ps -qf  expose=8080/tcp && docker ps -qf name=calculator_container | docker container rm -f calculator_container'
                
                    //     def containerId = bat (script: "docker ps -qf ancestor=docker-test1", returnStatus: true)
                        
                    //     //echo "${containerId}"
                    //     if (containerId!=1) {
                    //         //echo "if"
                    //          bat 'docker stop calculator_container'
                    //          bat 'docker container rm -f calculator_container'
                    //     }
                    //     else {
                    //       echo "No Container is Running"
                        
                    // }
              
//                 }
//             }
//         }
     
//       stage('Run Docker container') {
             
//             steps 
//                  {
//                     bat "docker run --name calculator_container -d -p 8003:8080 sulabhdocker09/docker-test1"
//                  }
//              }
        
        //              stage('Building image') {
//       steps{
//         script {
//           docker.build registry 
//         //   + ":$BUILD_NUMBER"
//         }
//       }
//              }
//              stage('Deploy Image') {
//         steps{  
//             script {
//                 docker.withRegistry( '', registryCredential ) {
//                     //  dockerImage.push()
//                     bat 'docker push sulabhdocker09/docker-test'
//                      }
//                  }
//               }
//              }
//              stage('Run Docker container on Jenkins Agent') {
             
//             steps 
//   {
//               bat 'docker run -d -p 8003:8080 sulabhdocker09/docker-test'
 
//             }
//         }
        

         }
             
//          post { 
//             always { 
//           junit 'target/surefire-reports/*.xml'   
        
//     }

// }

       
}
