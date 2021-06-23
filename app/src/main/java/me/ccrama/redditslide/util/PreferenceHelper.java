package me.ccrama.redditslide.util;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import me.ccrama.redditslide.R;

/**
 * Created by TacoTheDank on 05/12/2021.
 * <p>
 * When adding new settings, please adhere to the preference organization!
 */
public class PreferenceHelper {

    private static SharedPreferences sharedPreferences;

    public static void init(final Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static boolean getHelperBoolean(final String prefKey, final boolean defValue) {
        return sharedPreferences.getBoolean(prefKey, defValue);
    }


    //////////////////////////////////////////////////
    // Multi-column settings
    //////////////////////////////////////////////////
    public static boolean singleColumnMultiWindow() {//"singleColumnMultiWindow"
        return getHelperBoolean(Key.PREF_SINGLE_COLUMN_MULTI_WINDOW, false);
    }

    public static boolean portraitModeDualColumns() {//"dualPortrait"
        return getHelperBoolean(Key.PREF_PORTRAIT_MODE_DUAL_COLUMNS, false);
    }

    public static boolean forceFullCommentView() {//"forceFullCommentView"
        return getHelperBoolean(Key.PREF_FORCE_FULL_COMMENT_VIEW, false);
    }


    //////////////////////////////////////////////////
    // Comments settings
    //////////////////////////////////////////////////
    public static boolean cropImage() {
        return getHelperBoolean(Key.PREF_CROP_IMAGE, true);
    }

    public static boolean colorCommentDepth() {
        return getHelperBoolean(Key.PREF_COLOR_COMMENT_DEPTH, true);
    }

    public static boolean highlightCommentOP() {
        return getHelperBoolean(Key.PREF_HIGHLIGHT_COMMENT_OP, true);
    }

    public static boolean wideDepth() {
        return getHelperBoolean(Key.PREF_WIDE_DEPTH, false);
    }

    public static boolean showCommentFab() {
        return getHelperBoolean(Key.PREF_SHOW_COMMENT_FAB, false);
    }

    public static boolean rightHandedCommentMenu() {
        return getHelperBoolean(Key.PREF_RIGHT_HANDED_COMMENT_MENU, false);
    }

    public static boolean showUpvotePercentage() {
        return getHelperBoolean(Key.PREF_SHOW_UPVOTE_PERCENTAGE, false);
    }

    public static boolean coloredTimeBubble() {
        return getHelperBoolean(Key.PREF_COLORED_TIME_BUBBLE, true);
    }

    public static boolean hideCommentAwards() {
        return getHelperBoolean(Key.PREF_HIDE_COMMENT_AWARDS, false);
    }

    public static boolean parentCommentNav() {
        return getHelperBoolean(Key.PREF_PARENT_COMMENT_NAV, true);
    }

    public static boolean autohideCommentNavBar() {
        return getHelperBoolean(Key.PREF_AUTOHIDE_COMMENT_NAVBAR, false);
    }

    public static boolean showCollapseExpandButton() {
        return getHelperBoolean(Key.PREF_SHOW_COLLAPSE_EXPAND_BUTTON, false);
    }

    public static boolean volumeNavComments() {
        return getHelperBoolean(Key.PREF_VOLUME_NAV_COMMENTS, false);
    }

    public static boolean navbarVoteGestures() {
        return getHelperBoolean(Key.PREF_NAVBAR_VOTE_GESTURES, false);
    }

    public static boolean swapLongpressTap() {
        return getHelperBoolean(Key.PREF_SWAP_LONGPRESS_TAP, false);
    }

    public static boolean fullyCollapseComments() {
        return getHelperBoolean(Key.PREF_FULLY_COLLAPSE_COMMENTS, false);
    }

    public static boolean collapseChildComments() {
        return getHelperBoolean(Key.PREF_COLLAPSE_CHILD_COMMENTS, false);
    }

    public static boolean collapseDeletedComments() {
        return getHelperBoolean(Key.PREF_COLLAPSE_DELETED_COMMENTS, false);
    }


    //////////////////////////////////////////////////
    // History settings
    //////////////////////////////////////////////////
    public static boolean storeHistory() {
        return getHelperBoolean(Key.PREF_STORE_HISTORY, true);
    }

    public static boolean storeNsfwHistory() {
        return getHelperBoolean(Key.PREF_STORE_NSFW_HISTORY, false);
    }

    public static boolean scrollSeen() {
        return getHelperBoolean(Key.PREF_SCROLL_SEEN, false);
    }

    // Preference keys
    public static class Key {
        // Root menu settings
        public static final int PREF_ROOT_GENERAL = R.string.prefKey_general;
        public static final int PREF_ROOT_MULTICOLUMN = R.string.prefKey_multiColumn;
        public static final int PREF_ROOT_MANAGE_SUBREDDITS = R.string.prefKey_manageSubreddits;
        public static final int PREF_ROOT_MANAGE_OFFLINE_CONTENT = R.string.prefKey_manageOfflineContent;
        public static final int PREF_ROOT_MODERATION = R.string.prefKey_moderation;
        public static final int PREF_ROOT_MAIN_THEME = R.string.prefKey_mainTheme;
        public static final int PREF_ROOT_POST_LAYOUT = R.string.prefKey_postLayout;
        public static final int PREF_ROOT_SUBREDDIT_THEMES = R.string.prefKey_subredditThemes;
        public static final int PREF_ROOT_FONT = R.string.prefKey_font;
        public static final int PREF_ROOT_COMMENTS = R.string.prefKey_comments;
        public static final int PREF_ROOT_LINK_HANDLING = R.string.prefKey_linkHandling;
        public static final int PREF_ROOT_HISTORY = R.string.prefKey_history;
        public static final int PREF_ROOT_DATA_SAVING = R.string.prefKey_dataSaving;
        public static final int PREF_ROOT_FILTER_LIST = R.string.prefKey_filterList;
        public static final int PREF_ROOT_REDDIT_CONTENT = R.string.prefKey_redditContent;
        public static final int PREF_ROOT_BACKUP_RESTORE = R.string.prefKey_backupRestore;
        public static final int PREF_ROOT_SYNCCIT = R.string.prefKey_synccit;
        public static final int PREF_ROOT_PRO_UPGRADE = R.string.prefKey_proUpgrade;
        public static final int PREF_ROOT_DONATE = R.string.prefKey_donate;
        public static final int PREF_ROOT_ABOUT = R.string.prefKey_about;


        // Multi-column settings
        public static final int PREF_LANDSCAPE_SEEKBAR = R.string.prefKey_multicolumn_landscapeSeekbar;
        public static final String PREF_SINGLE_COLUMN_MULTI_WINDOW = "prefKey_multicolumn_singleColumnMultiWindow";//"singleColumnMultiWindow"
        public static final String PREF_PORTRAIT_MODE_DUAL_COLUMNS = "prefKey_multicolumn_portraitModeDualColumns";//"dualPortrait"
        public static final String PREF_FORCE_FULL_COMMENT_VIEW = "prefKey_multicolumn_forceFullCommentView";//"forceFullCommentView"


        // Comments settings
        public static final String PREF_CROP_IMAGE = "prefKey_comments_cropImage";//"cropImage"
        public static final String PREF_COLOR_COMMENT_DEPTH = "prefKey_comments_colorCommentDepth";//"colorCommentDepth"
        public static final String PREF_HIGHLIGHT_COMMENT_OP = "prefKey_comments_highlightCommentOp";//"commentOP"
        public static final String PREF_WIDE_DEPTH = "prefKey_comments_wideDepth";//"largeDepth"
        public static final String PREF_SHOW_COMMENT_FAB = "prefKey_comments_showCommentFab";//"commentFab"
        public static final String PREF_RIGHT_HANDED_COMMENT_MENU = "prefKey_comments_rightHandedComments";//"rightHandedCommentMenu"
        public static final String PREF_SHOW_UPVOTE_PERCENTAGE = "prefKey_comments_showUpvotePercentage";//"upvotePercentage"
        public static final String PREF_COLORED_TIME_BUBBLE = "prefKey_comments_coloredTimeBubble";//"highlightTime"
        public static final String PREF_HIDE_COMMENT_AWARDS = "prefKey_comments_hideCommentAwards";//"hideCommentAwards"
        public static final String PREF_PARENT_COMMENT_NAV = "prefKey_comments_parentCommentNav";//"Fastscroll"
        public static final String PREF_AUTOHIDE_COMMENT_NAVBAR = "prefKey_comments_autohideCommentNavbar";//"autohideComments"
        public static final String PREF_SHOW_COLLAPSE_EXPAND_BUTTON = "prefKey_comments_showCollapseExpandButton";//"showCollapseExpandButton"
        public static final String PREF_VOLUME_NAV_COMMENTS = "prefKey_comments_volumeNavComments";//"commentVolumeNav"
        public static final String PREF_NAVBAR_VOTE_GESTURES = "prefKey_comments_navbarVoteGestures";//"voteGestures"
        public static final String PREF_SWAP_LONGPRESS_TAP = "prefKey_comments_swapLongpressTap";//"Swap"
        public static final String PREF_FULLY_COLLAPSE_COMMENTS = "prefKey_comments_fullyCollapseComments";//"collapseCOmments"
        public static final String PREF_COLLAPSE_CHILD_COMMENTS = "prefKey_comments_collapseChildComments";//"collapseCommentsDefault"
        public static final String PREF_COLLAPSE_DELETED_COMMENTS = "prefKey_comments_collapseDeletedComments";//"collapseDeletedComments"


        // History settings
        public static final String PREF_STORE_HISTORY = "prefKey_history_storeHistory";//"storehistory"
        public static final String PREF_STORE_NSFW_HISTORY = "prefKey_history_storeNsfwHistory";//"storensfw"
        public static final String PREF_SCROLL_SEEN = "prefKey_history_scrollSeen";//"scrollSeen"
        public static final int PREF_CLEAR_SUBMISSION_HISTORY = R.string.prefKey_history_clearSubmissionHistory;
        public static final int PREF_CLEAR_SUBREDDIT_HISTORY = R.string.prefKey_history_clearSubredditHistory;
    }
}
