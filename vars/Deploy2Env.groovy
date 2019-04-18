#!/usr/bin/env groovy    

def call(def rpm_path, def rpm_name, def repo) {
   	//withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'effort_service_account', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {
    //	sh "set +x;  curl -u \"$USERNAME:$PASSWORD\" -X PUT -F packages=\"@${rpm_path}${rpm_name}\" \"https://yum.secureserver.net/api/v0.1/repos/${repo}/upload\""
    //}
    echo "set +x;  curl -u \"USERNAME:PASSWORD\" -X PUT -F packages=\"@${rpm_path}${rpm_name}\" \"https://yum.secureserver.net/api/v0.1/repos/${repo}/upload\""
}