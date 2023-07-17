package com.idemia.utilities;

public final class Constants {

    public final static String API_TOKEN = "7432e90346bb172bc89aecd7b2a11f4bf768eabe";
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
