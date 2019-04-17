#!/usr/bin/env groovy

// Jenkins usually sets some environment variables for Freestyle jobs:
//   https://wiki.jenkins-ci.org/display/JENKINS/Building+a+software+project
// Unfortunately, Pipeline jobs don't set the Git ones yet:
//   https://issues.jenkins-ci.org/browse/JENKINS-33719
// So we set them in this function. When they're supported properly, remove
// this function and it's invocations.
def call(options) {
  // We use this wierd file dance because many of the methods required to do
  // something more conventional (e.g., String.execute) are disallowed in the
  // Jenkins build sandbox.

  // GIT_COMMIT
  env.GIT_COMMIT = sh(script: "git rev-parse HEAD",
                      returnStdout: true).trim();
  env.GIT_SHORT_COMMIT = env.GIT_COMMIT.substring(0, 7);

  // GIT_COMMIT_MESSAGE
  env.GIT_COMMIT_MESSAGE = sh(script: "git log -1 --oneline | tr -d '\n'",
                              returnStdout: true).trim();

  // GIT_BRANCH
  def branchPieces = sh(script: "git name-rev --name-only ${env.GIT_COMMIT}",
                        returnStdout: true).trim().split('/');
  // We remove the first pieces (usually "remotes/origin")
  env.GIT_BRANCH = branchPieces[branchPieces.length - 1];
}
