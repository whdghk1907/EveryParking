<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-fluid">
    <header>
        <div class="row headerBox py-2 px-0">
            <div class="col-1 px-0 pt-1"><i class="bi bi-arrow-left fs-5" onclick="history.back();"></i></div>
            <div class="col px-0">
                <h5 class="title">문의 작성</h5>
            </div>
            <div class="col-1 px-0"></div>
        </div>
    </header>
    <main>
        <!-- 수정 해야되는 부분-->
        <div class="row topBox" style="margin-top: auto;">
            <div class="col">
                <form action="/operation/QNA/insertQna" method="post" enctype="multipart/form-data" onsubmit="uploadData()">
                	<input type="hidden" name="editorData">
                    <div class="row buyDetailLineBox">
                        <div class="col my-2 py-2">
                            <div class="row py-2">
                                <div class="col sectionName">문의 유형</div>
                            </div>
                            <div class="row pt-2">
                                <div>
                                    <select id="type" name="SUB_CODE" class="form-select formFontSize" aria-label="Default select example">
                                        <option selected>문의 유형을 선택해주세요.</option>
                                        <option value="QN01">사이트 문의</option>
                                        <option value="QN02">예약 문의</option>
                                        <option value="QN03">주차장 정보 문의</option>
                                        <option value="QN04">기타 관련</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row py-2">
                        <div class="col my-2 sectionName">문의 내용</div>
                    </div>
                    <div class="row pt-1">
                        <div class="col">
                            <input name="QNA_TITLE" type="text" class="form-control formFontSize" placeholder="문의 제목을 입력해주세요.">
                        </div>
                    </div>
                    <div class="row py-3">
                        <div class="col">
                            <textarea id="writeEditor" placeholder="문의할 내용을 입력해주세요."></textarea>
                        </div>
                    </div>
                    <div class="row py-4" style="align-item">
                        <div class="col" style="font-size: 1rem;">
 							<input type="file" name="FILE_SEQ" id="files">                      
                        </div>
                    </div>
                    <div class="row pt-4">
                        <div class="col">
                        	<button class="cancelBtn" style="float:right; width:5.5rem; height:2.5rem; border-radius:0.5rem;" onclick="history.back();">취소</button>
                            <button type="submit" class="longBtn" style="width:5.5rem; margin-right:0.2rem; float:right;">등록</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </main>
</div>
<script type="text/javascript" src="/js/operation/qnaManage/qnaManage.js"></script>
