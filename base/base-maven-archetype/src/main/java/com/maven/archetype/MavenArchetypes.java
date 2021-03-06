package com.maven.archetype;

// Archetype is a Maven project templating toolkit
// https://maven.apache.org/archetype/index.html  Archetype架构
// https://maven.apache.org/guides/mini/guide-creating-archetypes.html  自定义Archetype架构的实现
public class MavenArchetypes {

    // 使用maven指令生成指定的module项目架构
    // > mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-simple -DarchetypeVersion=1.4
    // > mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

    // TODO. 使用自定义的archetype模板生成
    // mvn archetype:generate
    //  -DgroupId=[your project's group id]
    //  -DartifactId=[your project's artifact id]
    //  -DarchetypeGroupId=org.apache.maven.archetypes
    //  -DarchetypeArtifactId=maven-archetype-archetype

    /**
     * Maven构建的项目基本结构
     * lib 存放本地静态jar的路径
     * src
     * -- main
     * ----- java
     * ---------- com.ctong
     * ---------------- package
     * -------------------- Main.java
     * ----- resources
     * ---------- images
     * ----- webapp  带UI界面的项目
     * ---------- WEB-INF
     * ---------------- web.xml
     * ---------- index.html
     * -- test
     * ----- java
     * ---------- com.ctong
     * ---------------- package
     * -------------------- MainTest.java
     * ----- resources
     * ---------- images
     * pom.xml
     */

}
