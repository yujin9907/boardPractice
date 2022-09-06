<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Blog</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <%--	부트스트랩 사용 css, js--%>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <%--    캘린더--%>
    <link href="/fullcalendar/lib/main.css" rel="stylesheet"/>
    <link href="/fullcalendar/lib/main.min.css" rel="stylesheet"/>
    <script src="/fullcalendar/lib/locales-all.js"></script>
    <script src="/fullcalendar/lib/locales-all.min.js"></script>
    <script src="/fullcalendar/lib/main.js"></script>
    <script src="/fullcalendar/lib/main.min.js"></script>
    <script>

        document.addEventListener('DOMContentLoaded', function () {
            var calendarEl = document.getElementById('calendar');
            var calendar = new FullCalendar.Calendar(calendarEl, {
                height: '100%',
                expandRows: true,
                slotMinTime: '08:00',
                slotMaxTime: '20:00',
                headerToolbar: {
                    left: 'prev,next',
                    center: 'title',
                    right: 'dayGridMonth,listWeek'
                },
                initialView: 'dayGridMonth',
                initialDate: '2020-09-12',
                navLinks: true, // can click day/week names to navigate views 상세로 넘어감
                editable: true,
                selectable: true,
                nowIndicator: true, // 뭐임?
                dayMaxEvents: true, // allow "more" link when too many events // 크기 제한
                // 일정 추가

                events: [

                    {
                        title: 'empty',
                        start: '2020-09-01',
                    },
                    {
                        title: 'Long Event',
                        start: '2020-09-07',
                        end: '2020-09-10'
                    },
                    {
                        groupId: 999,
                        title: 'Repeating Event',
                        start: '2020-09-09T16:00:00'
                    },
                    {
                        groupId: 999,
                        title: 'Repeating Event',
                        start: '2020-09-16T16:00:00'
                    },
                    {
                        title: 'Conference',
                        start: '2020-09-11',
                        end: '2020-09-13'
                    },
                    {
                        title: 'Meeting',
                        start: '2020-09-12T10:30:00',
                        end: '2020-09-12T12:30:00'
                    },
                    {
                        title: 'Lunch',
                        start: '2020-09-12T12:00:00'
                    },
                    {
                        title: 'Meeting',
                        start: '2020-09-12T14:30:00'
                    },
                    {
                        title: 'Happy Hour',
                        start: '2020-09-12T17:30:00'
                    },
                    {
                        title: 'Dinner',
                        start: '2020-09-12T20:00:00'
                    },
                    {
                        title: 'Birthday Party',
                        start: '2020-09-13T07:00:00'
                    },
                    {
                        title: 'Click for Google',
                        url: 'http://google.com/',
                        start: '2020-09-28'
                    }
                ]
            });

            calendar.render();
        });

    </script>
    <style>

        html, body {
            overflow: hidden; /* don't do scrollbars */
            font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
            font-size: 14px;
        }

        #calendar-container {
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
        }

        .fc-header-toolbar {
            /*
            the calendar will be butting up against the edges,
            but let's scoot in the header's buttons
            */
            padding-top: 1em;
            padding-left: 1em;
            padding-right: 1em;
        }

    </style>
</head>

<body>

<h1>${sessionScope.principal.username}</h1>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/main">Calendar</a>
        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <c:choose>
                    <c:when test="${empty principal}">
                        <li class="nav-item"><a class="nav-link" href="/login">로그인</a>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="/join">회원가입</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="nav-item"><a class="nav-link"
                                                href="/board/form">글쓰기</a></li>
                        <li class="nav-item"><a class="nav-link"
                                                href="/boards/writeForm" href="/logout">로그아웃</a></li>
                    </c:otherwise>
                </c:choose>

            </ul>
        </div>
    </div>
</nav>

<div id='calendar-container'>
    <div id='calendar'>허유진</div>
</div>

<%@ include file="layout/footer.jsp" %>








