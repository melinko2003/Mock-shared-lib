#!/usr/bin/env groovy

def call(options) {
	stage('PreStage') {
		steps {
			echo 'PreCall'
		}
	}
}
