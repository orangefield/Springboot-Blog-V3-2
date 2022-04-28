 // 게시글 삭제, 권한 체크 후 삭제 DELETE : /s/api/post/1
 $("#btn-delete").click(() => {
    postDelete();
});

async function postDelete() {
    let postId = $("#postId").val();
    let pageOwnerId = $("#pageOwnerId").val();

    let response = await fetch(`/s/api/post/${postId}`, {
        method: "DELETE"
    });

    if (response.status == 200) {
        alert("삭제 성공");
        location.href = `/user/${pageOwnerId}/post`;
    } else {
        alert("삭제 실패");
    }
}
