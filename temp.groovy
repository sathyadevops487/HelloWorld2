import jenkins.model.*



def doGetAllJenkinsDetails(){
	def jenkins = Jenkins.instance.getItem("multibranchtest")
	def job = jenkins.getItem(jobName)
	println "Job type: ${job.getClass()}"
	println "Is building: ${job.isBuilding()}"
	println "Is in queue: ${job.isInQueue()}"
	println "Last successfull build: ${job.getLastSuccessfulBuild()}"
	println "Last failed build: ${job.getLastFailedBuild()}"
	println "Last build: ${job.getLastBuild()}"
	println "All builds: ${job.getBuilds().collect{ it.getNumber()}}"
}

return this