package basic;

public class MavenLifecycle {

	// Maven Project Lifecycle
    // Maven Goals:
    // 1. Maven clean:
    //    Download and set up project
    //    Clean up the project

    // 2. Maven compile: compile source code to .class files
    //    > java Main

    // 3. Maven package:
    //    Download all plugins
    //    Run compile, run unit test and package that up
    //    > java -jar MainBasic-1.0.0-SNAPSHOT.jar 构建项目的jar文件，需要所有的测试通过

    // 4. Maven install:
    //    Download all dependencies
    //    Firstly, run the package command, then install in local repository
    //    Home directory C:\Users\tchen\.m2\repository\com

    // 5. Maven deploy
    //    Run install command and deploys it to a corporate or remote repository

    // 6. Maven Test
    //    > maven clean test 运行test目录下的所有测试

    // Configure > Convert "Project" to Maven Project
    // Convert any java projectw with pom.xml to Maven Project
}