package master;

// Each Goal represents a capability of that plugin 每一个Goal代表插件的能力
public class MavenPhasesGoal {

    // Phases ==> 在maven的什么阶段
    // 1. validate: validate project and structure
    // 2. compile: compile any source in the project
    // 3. test: test the complied code
    // 4. package: package the code in the specified package type
    // 5. integration-test: deploy and run integration test
    // 6. verify: run checks to verify integrity
    //           verify在install和deploy之前运行
    // 7. install: install package in local repo
    // 8. deploy: copy package to remote repo

    // Goal   ==> Lifecycle 双击执行Goal/Execute Maven Goal多个执行
    // 1. validate: validate the project is correct and info is available
    // 2. compile: compile the source code
    // 3. test: test the compiled source code using unit testing framework
    // 4. package: package code in distributable format (jar, war)
    // 5. verify: run any checks on the results of integration tests
    // 6. install: install the package to local repository for use in other projects locally
    //    需要在之前编译好Compile Goal
    // 7. deploy: copy package to remote repository for sharing
}
