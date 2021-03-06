package net.karlmartens.dotnet;

import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.gradle.internal.impldep.org.apache.commons.compress.compressors.CompressorStreamFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DotnetExtension {

    private String _configuration = null;
    private String _archiveAs = ArchiveStreamFactory.TAR;
    private String _compressAs = CompressorStreamFactory.GZIP;
    private String _dotnetHome = null;
    private String _solution = "";
    private String _projectPattern = "**/*.csproj";
    private String _testPattern = "**/*.tests.csproj";
    private String _packagePattern = "**/*.nupkg";
    private String _framework = null;
    private String _runtime = null;

    public DotnetExtension() {
        _dotnetHome = System.getenv("DOTNET_HOME");
    }


    public String getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(String configuration) {
        _configuration = configuration;
    }

    public String getArchiveAs() {
        return _archiveAs;
    }

    public void setArchiveAs(String archiveAs) {
        _archiveAs = archiveAs;
    }

    public String getCompressAs() {
        return _compressAs;
    }

    public void setCompressAs(String compressAs) {
        _compressAs = compressAs;
    }

    public String getFramework() {
        return _framework;
    }

    public void setFramework(String framework) {
        _framework = framework;
    }

    public String getRuntime() {
        return _runtime;
    }

    public void setRuntime(String runtime) {
        _runtime = runtime;
    }

    public String getDotnetHome() {
        return _dotnetHome;
    }

    public void setDotnetHome(String path) {
        _dotnetHome = path;
    }

    public String getExecutable() {
        String executable = "dotnet";
        if (_dotnetHome == null)
            return executable;

        Path path = Paths.get(_dotnetHome, executable);
        return path.toString();
    }

    public void setSolution(String solution) { _solution = solution; }

    public String getSolution() { return _solution; }

    public String getProjectPattern() {
        return _projectPattern;
    }

    public void setProjectPatten(String pattern) {
        _projectPattern = pattern;
    }

    public String getTestPattern() {
        return _testPattern;
    }

    public void setTestPattern(String pattern) {
        _testPattern = pattern;
    }

    public String getPackagePattern() {
        return _packagePattern;
    }

    public void setPackagePattern(String pattern) {
        _packagePattern = pattern;
    }

}
