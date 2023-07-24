package com.idemia.utilities;

import com.idemia.model.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.time.LocalDate;

import static com.idemia.utilities.Constants.*;
import static net.serenitybdd.rest.RestRequests.given;

public class RestHelper {

//    /**
//     *
//     * @param projectName Name of the project
//     * @return Response
//     */
//    public static Response createNewProject(String projectName) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .body(String.format("{\"name\": \"%s\"}", projectName))
//            .post(PROJECTS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param projectID ID of existing project
//     * @return Response
//     */
//    public static Response deleteProject(String projectID) {
//        return given()
//            .log()
//            .all()
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .delete(PROJECT_ID_ENDPOINT, projectID)
//            .prettyPeek();
//
//    }
//
//    /**
//     *
//     * @return Response
//     */
//    public static Response getAllProjects() {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .get(PROJECTS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param projectID ID of existing project
//     * @return Response
//     */
//    public static Response getProject(String projectID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .get(PROJECT_ID_ENDPOINT, projectID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param projectID ID of existing project
//     * @param isFavourite True if task should be attached to Favourites section
//     * @return Response
//     */
//    public static Response updateProject(String projectID, boolean isFavourite) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .body(String.format("{\"is_favorite\": %s}", isFavourite))
//            .post(PROJECT_ID_ENDPOINT, projectID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskName Title of task
//     * @param projectID ID of existing project
//     * @return Response
//     */
//    public static Response createNewTask(String taskName, String projectID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .body(String.format("{\"content\": \"%s\", \"project_id\": %s}", taskName, projectID))
//            .post(TASKS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskID ID of existing task
//     * @return Response
//     */
//    public static Response deleteTask(String taskID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .delete(TASKS_ID_ENDPOINT, taskID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskID ID of existing task
//     * @return Response
//     */
//    public static Response closeTask(String taskID) {
//        return given()
//            .log()
//            .all()
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .post(CLOSE_TASK_ENDPOINT, taskID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskID ID of existing task
//     * @return Response
//     */
//    public static Response reopenTask(String taskID) {
//        return given()
//            .log()
//            .all()
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .post(REOPEN_TASK_ENDPOINT, taskID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskID ID of existing task
//     * @param priority Priority from 1 (Low Priority) to 4 (The highest Priority)
//     * @return Response
//     */
//    public static Response updateTaskPriority(String taskID, int priority) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .body(String.format("{\"priority\": %s}", priority))
//            .post(TASKS_ID_ENDPOINT, taskID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @return Response
//     */
//    public static Response getAllActiveTasks() {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .get(TASKS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskID ID of existing task
//     * @return Response
//     */
//    public static Response getActiveTask(String taskID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .get(TASKS_ID_ENDPOINT, taskID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param projectID ID of existing project
//     * @return Response
//     */
//    public static Response getAllCommentsFromProject(String projectID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .queryParam("project_id", projectID)
//            .get(COMMENTS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskID ID of existing task
//     * @return Response
//     */
//    public static Response getAllCommentsFromTask(String taskID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .queryParam("task_id", taskID)
//            .get(COMMENTS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param projectID ID of existing project
//     * @param message comment's message
//     * @return Response
//     */
//    public static Response createNewCommentForProject(String projectID, String message) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .body(String.format("{\"project_id\":\"%s\",\"content\":\"%s\"}", projectID, message))
//            .post(COMMENTS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param taskID ID of existing task
//     * @param message comment's message
//     * @return Response
//     */
//    public static Response createNewCommentForTask(String taskID, String message) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .body(String.format("{\"task_id\":\"%s\",\"content\":\"%s\"}", taskID, message))
//            .post(COMMENTS_ENDPOINT)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param commentID ID of existing comment
//     * @return Response
//     */
//    public static Response getComment(String commentID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .get(COMMENTS_ID_ENDPOINT, commentID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param commentID ID of existing comment
//     * @param message comment's message
//     * @return Response
//     */
//    public static Response updateComment(String commentID, String message) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .body(String.format("{\"content\":\"%s\"}", message))
//            .post(COMMENTS_ID_ENDPOINT, commentID)
//            .prettyPeek();
//    }
//
//    /**
//     *
//     * @param commentID ID of existing project
//     * @return Response
//     */
//    public static Response deleteComment(String commentID) {
//        return given()
//            .log()
//            .all()
//            .contentType(ContentType.JSON)
//            .header("Authorization", "Bearer " + API_TOKEN)
//            .delete(COMMENTS_ID_ENDPOINT, commentID)
//            .prettyPeek();
//    }

    public static Response createUser(User user) {
        return given()
                .log().all()
                .baseUri(URL)
                .contentType(ContentType.JSON)
                .body(user)
                .log().all()
                .when()
                .post(postUser_ENDPOINT)
                .prettyPeek();
    }


}
