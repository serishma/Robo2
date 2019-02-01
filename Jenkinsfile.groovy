node{
stage('Publish Robot results') {
    script {
          step(
            [
              $class              : 'RobotPublisher',
              outputPath          : 'https://github.com/serishma/Robo2.git',
              outputFileName      : "output.xml",
              reportFileName      : 'report.html',
              logFileName         : 'log.html',
              disableArchiveOutput: false,
              passThreshold       : 95,
              unstableThreshold   : 90,
              otherFiles          : "**/*.png,**/*.jpg",
            ]
          )
        }
  }

}
