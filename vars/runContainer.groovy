def call(){
    sh "docker run -d --name youtube2 -p 3000:3000 satyamounika/youtube:latest"
}
