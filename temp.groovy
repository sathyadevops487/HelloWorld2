import jenkins.model.*
import jenkins.*


def doGetAllJenkinsDetails(jobname){
	def list = ["Kay","Henry","Justin","Tom"]
	def lastSuccessfulPipelineID = Jenkins.instance.getItem("multibranchpipeline").lastCompletedBuild.displayname
	for (int f = 0; f < list.size(); f++){
		echo "${list[f]}"
	}
	println(lastSuccessfulPipelineID)
}

return this