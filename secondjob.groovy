job('example3') {
    steps {
        shell('echo this is my three seedjob')
    }
}
job('example4') {
    steps {
        shell('echo this is my four seedjob')
    }
}