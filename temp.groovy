import jenkins.model.*

def doGetAllJenkinsDetails(jobname){
	def lastSuccessfulPipelineID = build.getProject().getLastSuccessfulBuild().properties.get("envVars")['JOB_NAME']
	def pa = new ParametersAction([
		new StringParameterValue("lastSuccessfulPipelineID", lastSuccessfulPipelineID)
	])
	println(lastSuccessfulPipelineID)
}

return this