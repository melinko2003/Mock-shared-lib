#!/usr/bin/env groovy    

def call(def gitbranch) {
	//timeout(time: 5, unit: 'MINUTES') {
	//	sh "sleep 5 && ./scripts/check_qg.sh billing-ms-${gitbranch}"
	//}
	echo "sleep 5 && ./scripts/check_qg.sh billing-ms-${gitbranch}"

}