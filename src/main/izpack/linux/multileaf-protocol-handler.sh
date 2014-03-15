gconftool-2 -t string -s /desktop/gnome/url-handlers/leafcoin/command "java -splash:doesnotexist.png -jar $INSTALL_PATH/multileaf-exe.jar %s"
gconftool-2 -s /desktop/gnome/url-handlers/leafcoin/needs_terminal false -t bool
gconftool-2 -t bool -s /desktop/gnome/url-handlers/leafcoin/enabled true