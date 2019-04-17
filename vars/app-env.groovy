#!/usr/bin/env groovy

def call(options) {
	
	env.YUM_URL = 'https://yum.secureserver.net/api/v0.1/repos'
        env.DEV_REPO = 'dev/centos/7/x86_64/pkims'
        env.TEST_REPO = 'test/centos/7/x86_64/pkims'
        env.SALT_MASTER = 'https://certlint-api.salt.int.godaddy.com:8000'
        #BUILD_DATE=new Date().format( 'yyyyMMddHHmm' )
        env.RPM_PATH_BASE= './'
        #APP_NAME= ${options}
	env.RPM_NAME="${APP_NAME}-${BUILD_DATE}-1.git.${GIT_COMMIT}.x86_64.rpm"
	
}

