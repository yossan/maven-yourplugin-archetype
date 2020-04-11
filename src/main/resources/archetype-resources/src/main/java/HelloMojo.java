#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

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

