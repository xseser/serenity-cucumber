package com.idemia.utilities;

public final class Constants {

    public final static String API_TOKEN = "YOUR API KEY";

    public final static String PROJECTS_ENDPOINT = "https://api.todoist.com/rest/v2/projects";
    public final static String PROJECT_ID_ENDPOINT = "https://api.todoist.com/rest/v2/projects/{projectID}";
    public final static String TASKS_ENDPOINT = "https://api.todoist.com/rest/v2/tasks";
    public final static String TASKS_ID_ENDPOINT = "https://api.todoist.com/rest/v2/tasks/{taskID}";
    public final static String CLOSE_TASK_ENDPOINT = "https://api.todoist.com/rest/v2/tasks/{taskID}/close";
    public final static String REOPEN_TASK_ENDPOINT = "https://api.todoist.com/rest/v2/tasks/{taskID}/reopen";
    public final static String COMMENTS_ENDPOINT = "https://api.todoist.com/rest/v2/comments";
    public final static String COMMENTS_ID_ENDPOINT = "https://api.todoist.com/rest/v2/comments/{commentID}";

    private Constants() {}
}
