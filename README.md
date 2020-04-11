# Introduction

This archetype can be used for creating a your maven plugin.

# Features

* easy to create a mavne plugin.
* the build-in dependencies
    * maven-plugin-api 
    * maven-plugin-annotations
    * maven-project
    * junit 5

# Instalattion

```
$ cd maven-yourplugin-archetype
$ mvn install
```

# Usage

## 1. Generating your plugin

```
$ mvn archetype:generate -DarchetypeCatalog=local
1: local -> ..
...
#: local -> io.github.yossan:maven-yourplugin-archetype (maven-yourplugin-archetype)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): #:
```

1. Select #, which is the number of `io.github.yossan:maven-yourplugin-archetype`.
2. Set the ${groupId}
3. Set the ${name}
4. Set the ${version}

## 2. Customizing HelloMojo

${pacage}.HelloMojo.java

```
@Mojo(name = "sayhello", defaultPhase = LifecyclePhase.COMPILE)
public class HelloMojo extends AbstractMojo {

    // @Parameter(defaultValue = "${project}", required = true, readonly = true)
    // MavenProject project;

    // @Parameter(property = "scope")
    // String scope;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello World");
    }
}
```

* `sayhello` is plguin name
*  `defaultPhasee` is compile

## 3. Installing your plugin

```
$ mvn clean install
```

## 4. Executing your plugin.

```
$ mvn groupId:artifactId:version:goal
```


# References

* https://www.baeldung.com/maven-plugin


# License

MIT



