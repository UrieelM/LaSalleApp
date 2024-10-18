package com.example.a512lasalleapp.ui.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null

public val Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Task!!
    }

private var _Task: ImageVector? = null


public val Cash: ImageVector
    get() {
        if (_Cash != null) {
            return _Cash!!
        }
        _Cash = ImageVector.Builder(
            name = "Cash",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(0f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
        }.build()
        return _Cash!!
    }

private var _Cash: ImageVector? = null


public val Password: ImageVector
    get() {
        if (_Password != null) {
            return _Password!!
        }
        _Password = ImageVector.Builder(
            name = "Password",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(46f, -242f)
                lineToRelative(-52f, -30f)
                lineToRelative(34f, -60f)
                horizontalLineTo(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(68f)
                lineToRelative(-34f, -58f)
                lineToRelative(52f, -30f)
                lineToRelative(34f, 58f)
                lineToRelative(34f, -58f)
                lineToRelative(52f, 30f)
                lineToRelative(-34f, 58f)
                horizontalLineToRelative(68f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-68f)
                lineToRelative(34f, 60f)
                lineToRelative(-52f, 30f)
                lineToRelative(-34f, -60f)
                close()
                moveToRelative(320f, 0f)
                lineToRelative(-52f, -30f)
                lineToRelative(34f, -60f)
                horizontalLineToRelative(-68f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(68f)
                lineToRelative(-34f, -58f)
                lineToRelative(52f, -30f)
                lineToRelative(34f, 58f)
                lineToRelative(34f, -58f)
                lineToRelative(52f, 30f)
                lineToRelative(-34f, 58f)
                horizontalLineToRelative(68f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-68f)
                lineToRelative(34f, 60f)
                lineToRelative(-52f, 30f)
                lineToRelative(-34f, -60f)
                close()
                moveToRelative(320f, 0f)
                lineToRelative(-52f, -30f)
                lineToRelative(34f, -60f)
                horizontalLineToRelative(-68f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(68f)
                lineToRelative(-34f, -58f)
                lineToRelative(52f, -30f)
                lineToRelative(34f, 58f)
                lineToRelative(34f, -58f)
                lineToRelative(52f, 30f)
                lineToRelative(-34f, 58f)
                horizontalLineToRelative(68f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-68f)
                lineToRelative(34f, 60f)
                lineToRelative(-52f, 30f)
                lineToRelative(-34f, -60f)
                close()
            }
        }.build()
        return _Password!!
    }

private var _Password: ImageVector? = null

public val Nightlight: ImageVector
    get() {
        if (_Nightlight != null) {
            return _Nightlight!!
        }
        _Nightlight = ImageVector.Builder(
            name = "Nightlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(560f, 880f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                reflectiveQuadToRelative(-86f, -127.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -83f, 31.5f, -155.5f)
                reflectiveQuadToRelative(86f, -127f)
                reflectiveQuadToRelative(127.5f, -86f)
                reflectiveQuadTo(560f, 80f)
                quadToRelative(54f, 0f, 105f, 14f)
                reflectiveQuadToRelative(95f, 40f)
                quadToRelative(-91f, 53f, -145.5f, 143.5f)
                reflectiveQuadTo(560f, 480f)
                reflectiveQuadToRelative(54.5f, 202.5f)
                reflectiveQuadTo(760f, 826f)
                quadToRelative(-44f, 26f, -95f, 40f)
                reflectiveQuadTo(560f, 880f)
                moveToRelative(0f, -80f)
                horizontalLineToRelative(21f)
                quadToRelative(10f, 0f, 19f, -2f)
                quadToRelative(-57f, -66f, -88.5f, -147.5f)
                reflectiveQuadTo(480f, 480f)
                reflectiveQuadToRelative(31.5f, -170.5f)
                reflectiveQuadTo(600f, 162f)
                quadToRelative(-9f, -2f, -19f, -2f)
                horizontalLineToRelative(-21f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(240f, 480f)
                reflectiveQuadToRelative(93.5f, 226.5f)
                reflectiveQuadTo(560f, 800f)
                moveToRelative(-80f, -320f)
            }
        }.build()
        return _Nightlight!!
    }

private var _Nightlight: ImageVector? = null


public val Price_check: ImageVector
    get() {
        if (_Price_check != null) {
            return _Price_check!!
        }
        _Price_check = ImageVector.Builder(
            name = "Price_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(260f, 599f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 359f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 159f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 359f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 559f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(298f, 240f)
                lineTo(388f, 669f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 114f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        return _Price_check!!
    }

private var _Price_check: ImageVector? = null


public val Unknown_document: ImageVector
    get() {
        if (_Unknown_document != null) {
            return _Unknown_document!!
        }
        _Unknown_document = ImageVector.Builder(
            name = "Unknown_document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 160f)
                verticalLineToRelative(640f)
                close()
                verticalLineToRelative(200f)
                close()
                moveToRelative(80f, 400f)
                horizontalLineToRelative(147f)
                quadToRelative(11f, -23f, 25.5f, -43f)
                reflectiveQuadToRelative(32.5f, -37f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(123f)
                quadToRelative(-3f, -20f, -3f, -40f)
                reflectiveQuadToRelative(3f, -40f)
                horizontalLineTo(280f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(92f)
                quadToRelative(-19f, -6f, -39f, -9f)
                reflectiveQuadToRelative(-41f, -3f)
                verticalLineToRelative(-40f)
                horizontalLineTo(480f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(227f)
                quadToRelative(11f, 23f, 25.5f, 43f)
                reflectiveQuadTo(485f, 880f)
                close()
                moveToRelative(480f, -400f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                reflectiveQuadToRelative(-58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                reflectiveQuadToRelative(-141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                reflectiveQuadToRelative(58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                moveToRelative(0f, 320f)
                quadToRelative(11f, 0f, 18.5f, -7.5f)
                reflectiveQuadTo(706f, 774f)
                reflectiveQuadToRelative(-7.5f, -18.5f)
                reflectiveQuadTo(680f, 748f)
                reflectiveQuadToRelative(-18.5f, 7.5f)
                reflectiveQuadTo(654f, 774f)
                reflectiveQuadToRelative(7.5f, 18.5f)
                reflectiveQuadTo(680f, 800f)
                moveToRelative(-18f, -76f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -11f, 6f, -19.5f)
                reflectiveQuadToRelative(14f, -16.5f)
                quadToRelative(14f, -12f, 22f, -23f)
                reflectiveQuadToRelative(8f, -31f)
                quadToRelative(0f, -29f, -19f, -46.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(-23f, 0f, -41.5f, 13.5f)
                reflectiveQuadTo(612f, 610f)
                lineToRelative(32f, 14f)
                quadToRelative(3f, -12f, 12.5f, -21f)
                reflectiveQuadToRelative(23.5f, -9f)
                quadToRelative(15f, 0f, 23.5f, 7.5f)
                reflectiveQuadTo(712f, 624f)
                quadToRelative(0f, 11f, -6f, 18.5f)
                reflectiveQuadTo(692f, 658f)
                quadToRelative(-6f, 6f, -12.5f, 12f)
                reflectiveQuadTo(668f, 684f)
                quadToRelative(-3f, 6f, -4.5f, 12f)
                reflectiveQuadToRelative(-1.5f, 14f)
                close()
            }
        }.build()
        return _Unknown_document!!
    }

private var _Unknown_document: ImageVector? = null





