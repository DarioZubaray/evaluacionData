package com.imagosur.domain;

public class AboutVersion {
    private String version;
    private String groupId;
    private String projectName;

    public String toJsonString() {
        String versionJson = "\"version\": \"" + version + "\", ";
        String groupIdJson = "\"groupId\":\"" + groupId + "\", ";
        String projectNameJson = "\"projectName\":\"" + projectName + "\" ";
        return "{" + versionJson + groupIdJson + projectNameJson + "}";
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}