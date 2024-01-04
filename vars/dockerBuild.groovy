def call(String dockerHubUsername, String imageName) {
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=e3eb1346dcmshe8afa1ce68da5ebp10b5a1jsn53eafd66ed50 -t ${imageName} ."
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}
