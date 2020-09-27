import jenkins.model.Jenkins;

def jenkins = Jenkins.getInstance()
def jobName = "multibranchtest"
def job = jenkins.getItem(jobName)

def doGetAllJenkinsDetails(){
	def lastSuccessfulPipelineID = build.getProject().getLastSuccessfulBuild().properties.get("envVars")['PipelineNumber']
	def pa = new ParametersAction([
	  new StringParameterValue("lastSuccessfulPipelineID", lastSuccessfulPipelineID)
	])
	println(lastSuccessfulPipelineID)
}
