package app.neteaseja.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.SupportedAbi

object Constants {
    val COMPATIBILITY_NETEASE = Compatibility(
        name = "网易云音乐",
        packageName = "com.netease.cloudmusic",
        apkFileType = ApkFileType.APK,
        // NetEase Cloud Music brand red.
        appIconColor = 0xE60012,
        targets = listOf(
            // Exact version this patch set was developed and verified against.
            AppTarget(
                version = "9.6.13",
                versionCodes = mapOf(
                    // Official 64-bit build from music.163.com.
                    SupportedAbi.ARM64_V8A to 9006013
                )
            ),
            // Best effort for newer versions: resource names are looked up
            // by name at patch time, so untouched strings keep working.
            // Run tools/migrate_translations.py after each app update.
            AppTarget(
                version = null,
                isExperimental = true
            )
        )
    )
}
