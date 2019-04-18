#!/usr/bin/env groovy    

def call(def gitbranch, def system) {
	if ( ${gitbranch} == 'origin/master') {
              echo "build job: 'salt_update_puppet', parameters: [[$class: 'StringParameterValue', name: 'env', value: ${system}]]"
              echo "build job: 'salt-run-integrations', parameters: [[$class: 'StringParameterValue', name: 'env', value: ${system}]]"
	}
}
