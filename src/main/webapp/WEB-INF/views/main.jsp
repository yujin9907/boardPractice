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

        document.addEventListener('DOMContentLoaded', function() {
            var calendarEl = document.getElementById('calendar');

            var calendar = new FullCalendar.Calendar(calendarEl, {
                headerToolbar: {
                    left: 'prevYear,prev,next,nextYear today',
                    center: 'title',
                    right: 'dayGridMonth,dayGridWeek,dayGridDay'
                },
                //initialDate: '2020-09-12',
                navLinks: true, // can click day/week names to navigate views
                editable: true,
                dayMaxEvents: true, // allow "more" link when too many events
                events: [
                    {
                        title: 'All Day Event',
                        start: '2020-09-01'
                    },
                    {
                        title: 'Long Event',
                        start: '2020-09-07',
                        end: '2020-09-10'
                    },
                    // {start : "2016-05-30",
                    // imageurl : "./images/vader.png"
                    // }
                ]
                // , eventRender:function(event, eventElement) {
                // if(event.imageurl) {
                // eventElement.find("span.fc-title").prepend("<center><img src='" + event.imageurl + "'><center>");
                // }
                // 출처: https://wickedmagic.tistory.com/503?category=697215 [사악미소의 현대마법의 공방:티스토리]
            });

            calendar.render();
        });

    </script>
    <style>

        body {
            margin: 40px 10px;
            padding: 0;
            font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
            font-size: 14px;
        }

        #calendar {
            max-width: 1100px;
            margin: 0 auto;
        }

    </style>
</head>
<body>

<div id='calendar'></div>
<%@ include file="layout/footer.jsp" %>








