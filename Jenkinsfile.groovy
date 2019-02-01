node{
stage('Publish Robot results') {
    script {
          step(
            [
              $class              : 'RobotPublisher',
              outputPath          : 'C:/Users/pserishm/Documents/Robo2',
              outputFileName      : "C:/Users/pserishm/Documents/Robo2/output.xml",
              reportFileName      : 'C:/Users/pserishm/Documents/Robo2/report.html',
              logFileName         : 'C:/Users/pserishm/Documents/Robo2/log.html',
              disableArchiveOutput: false,
              passThreshold       : 95,
              unstableThreshold   : 90,
              otherFiles          : "**/*.png,**/*.jpg",
            ]
          )
        }
  }

}