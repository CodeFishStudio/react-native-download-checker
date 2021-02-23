import {
	NativeModules
} from 'react-native';

const RNDownloadChecker = NativeModules.RNDownloadChecker;

const DownloadChecker = {

	verifyInstallerId() {
		return RNDownloadChecker.verifyInstallerId();
	},

	closeApp() {
		return RNDownloadChecker.closeApp();
	}
};

module.exports = DownloadChecker;
