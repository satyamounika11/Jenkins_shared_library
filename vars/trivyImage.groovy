def call() {
    sh 'trivy image satyamounika/youtube:latest > trivyimage.txt'
}
