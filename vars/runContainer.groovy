def call(){
    sh "docker run -d --name ytimage -p 3000:3000 satyamounika/youtube:latest"
}
