<%-- 
    Document   : sidebarLeft
    Created on : 21-01-2023, 11:14:57
    Author     : phanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="sb2-1">
    <!--== LEFT MENU ==-->
    <div class="sb2-13">
        <ul class="collapsible" data-collapsible="accordion">
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-home" aria-hidden="true"></i>Home</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="dashboard"><i class="fa fa-dashboard" aria-hidden="true"></i>Dashboard</a></li>
                        <li><a href="home"><i class="fa fa-home" aria-hidden="true"></i>FLM Home</a>
                        </li>
                    </ul>
                </div>
            </li>
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-users" aria-hidden="true"></i> Users</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="admin-alluser">All Users</a></li>
                        <li><a href="#!">ADMIN</a></li>
                        <li><a href="#!">Add New Account</a></li>
                        <li><a href="#!">Reset Password</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-book" aria-hidden="true"></i>Curriculum</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="#!"><i class="fa fa-list-ol" aria-hidden="true"></i>All Curriculuum</a></li>
                        <li><a href="#!"><i class="fa fa-plus" aria-hidden="true"></i>Add New Curriculum</a></li>
                        <li><a href="#!"><i class="fa fa-check" aria-hidden="true"></i>Approve / Disapprove</a>
                        </li>
                    </ul>
                </div>
            </li>

            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-server" aria-hidden="true"></i>Syllabus</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="#!">All Syllabus</a></li>
                        <li><a href="#!">Add New Syllabus</a></li>

                    </ul>
                </div>
            </li>
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-graduation-cap" aria-hidden="true"></i> Subject</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="admin-main-menu.html">All Subject</a></li>
                        <li><a href="admin-about-menu.html">All Session</a></li>
                        <li><a href="admin-admission-menu.html">All Material</a></li>
                        <li><a href="admin-all-menu.html">Add New Subject</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-pencil" aria-hidden="true"></i> Combo</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="comboList">All Combo</a></li>
                        <li><a href="comboAdd">Add New Combo</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-pencil" aria-hidden="true"></i> PLO-PO</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="ploList">All PLO</a></li>
                        <li><a href="ploAdd">Add New PLO</a></li>
                        <li><a href="poList">All PO</a></li>
                        <li><a href="poAdd">Add New PO</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-pencil" aria-hidden="true"></i> Elective</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="electiveList">All Elective</a></li>
                        <li><a href="electiveDetail?type=add">Add New Elective</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="javascript:void(0)" class="collapsible-header"><i class="fa fa-pencil" aria-hidden="true"></i> Exam time table</a>
                <div class="collapsible-body left-sub-menu">
                    <ul>
                        <li><a href="admin-exam-all.html">All Exams</a></li>
                        <li><a href="admin-exam-add.html">Add New Exam</a></li>
                        <li><a href="admin-exam-group-all.html">All Groups</a></li>
                        <li><a href="admin-exam-group-add.html">Create New Groups</a></li>
                    </ul>
                </div>
            </li>
        </ul>
    </div>
</div>
